/********************************************************************
 * カレンダーによる日付入力スクリプト 2002/11/15
 *
 * ( 下記スクリプトは改造も可能ですがまったくいじらずにそのままペース
 *   トするだけでもご利用いただけるように書いてあります )
 *
 Syntax :

	wrtCalendarLayLay( formElementObject , event , 日付タイプ )


	使いたいINPUT入力タグにonFocus="wrtCalendarLay(this,event)"をペーストします。
	FORMとINPUTタグに違う名前(NAME属性)を忘れずに付けておいてください。

	引数 :

	formElementObject  入力したいフォームエレメント

	event  イベント( event | null )
				eventでカーソルのそばに現れる、nullで固定

	日付タイプ

				'yyyy' → 2005
				'yyyy/mm' → 2005/3
				'yyyy/mm/dd' → 2002/2/19
				'mm/dd' → 12/24
				'mm' → 3
				'dd' → 31
				'yyyy/mm/dd[曜]' → 2002/6/4 [火]
				'yyyy/mm/dd(曜)' → 2002/6/4 (火)
				'yyyy年mm月dd日(曜)'→ 2002年2月19日(火)
				'mm月dd日' → 1月1日
				'mm月dd日(曜)' → 1月1日(木)

				*　デフォルトは、'yyyy/mm/dd'
				*  Mac版IEでは漢字の混ざるタイプは使えません。

	例1 : wrtCalendarLay( this , event )
	例2 : wrtCalendarLay( this , event , 'mm/dd' )
	例3 : wrtCalendarLay( document.form1.element3 , event , 'mm月dd日(曜)' )
	例4 : wrtCalendarLay( this.form.element['e0'] , event , 'yyyy年mm月dd日(曜)' )

	Example :

		受付日1:<input name="e1" type="text"
					onFocus="wrtCalendarLay(this,event)">

		受付日2:<input name="e2" type="text"
					onFocus="wrtCalendarLay(this,event,'yyyy年mm月dd日(曜)')">
 *
 * ------------------------------------------------------------------
 * calendar.js Copyright(c)1999 Toshirou Takahashi tato@fureai.or.jp
 * Support http://www.fureai.or.jp/~tato/JS/BOOK/INDEX.HTM
 * ------------------------------------------------------------------
 *  2004/7/9 修正:角田 桂一(http://www.h3.dion.ne.jp/~sakatsu/index.htm)
 *	・文字色を日曜(赤),土曜(青)に変更
 *	・本日日付の強調をピンク背景から太字に変更(祝日強調の為)
 *	・前月/翌月部分をグレー反転表示
 *	・祝日をピンク背景で強調(祝日判定用ソースが必要です)
 *		 (http://www.h3.dion.ne.jp/~sakatsu/HolidayChk.js)
 *
 ********************************************************************/

	var now	= new Date()
	var absnow = now
	var Win	= navigator.userAgent.indexOf('Win')!=-1
	var Mac	= navigator.userAgent.indexOf('Mac')!=-1
	var X11	= navigator.userAgent.indexOf('X11')!=-1
	var Moz	= navigator.userAgent.indexOf('Gecko')!=-1
	var msie   = navigator.userAgent.indexOf('MSIE')!=-1
	var bwlang = getBrowserLANG()
	var _utf   = "あ".length > 1
	var nonja  = ( _utf || bwlang == 'en')

	var shim_id = "__calendar";
	document.write('<iframe id="'+shim_id+'" src="javascript:false" scrolling="no" frameborder="0" style="filter:Alpha(opacity=80); position:absolute; topzIndex=9999; display:none"></iframe>')
	function getShim(){
		shim = document.getElementById(shim_id);
		return shim;
	}

	if( nonja ){var week   = new Array('sun','mon','tue','wed','thu','fri','sat'); }
	else{		var week   = new Array('日','月','火','水','木','金','土'); }

	//入力後退避位置
	if( Mac && msie ){ var gox=2000 ; var goy=2000; }
	else			 { var gox=-300 ; var goy=-300; }
	//n4用レイヤー出力位置
	if(document.layers){var n4_left=300 ; var n4_top= 100; }

	calendarLay['calendar']=new calendarLay('calendar',-100,-100,'');


	function wrtCalendarLay1(oj,e,dateType,arg1){

		set_event__wrtCalendarLay() //イベントキャプチャースタート

		// 日付タイプデフォルト値設定と空白文字列除去
		if(!arguments[2])dateType='yyyy/mm/dd';
		else arguments[2].split(' ').join('').split('　').join('')

		// 月移動フラグデフォルト設定
		if(!arguments[3]){ arg1=0; }

		wrtCalendarLay.arg1 = arg1
		wrtCalendarLay.oj = oj
		wrtCalendarLay.dateType = dateType

		// 現在初期化
		if(arg1==0){ now = new Date(); }

		// 年月日取得
		nowdate  = now.getDate()
		nowmonth = now.getMonth()
		nowyear  = now.getYear()

		// 月移動処理
		if(nowmonth==11 && arg1 > 0){		//12月でarg1が+なら
			nowmonth = -1 + arg1 ; nowyear++   //月はarg1-1;1年加算
		} else if(nowmonth==0 && arg1 < 0){  //1月でarg1が-なら
			nowmonth = 12 + arg1 ; nowyear--   //月はarg1+12;1年減算
		} else {
			nowmonth +=  arg1				  //2-11月なら月は+arg1
		}

		// 2000年問題対応
		if(nowyear<1900){ nowyear=1900+nowyear; }

		// 現在月を確定
		now   = new Date(nowyear,nowmonth,1)

		// YYYYMM作成
		nowyyyymm=nowyear*100+nowmonth

		// YYYY/MM作成
		nowtitleyyyymm=nowyear+'/'+(nowmonth + 1)

		// カレンダー構築用基準日の取得
		fstday   = now										   //今月の1日
		startday = fstday - ( fstday.getDay() * 1000*60*60*24 )  //最初の日曜日
		startday = new Date(startday)

		// カレンダー構築用HTML
		ddata = '';
		ddata += '<form>\n'
		ddata += '<table border="0" bgcolor="#dddddd"  bordercolor="#dddddd" width="140" height="140"\n'
		ddata += 'style="\n'
		ddata += 'font-family	  : Arial;\n'
		ddata += 'font-size		: 14px;\n'
		ddata += 'border-top	   : 1px outset #ffffff;\n'
		ddata += 'border-right	 : 1px outset #888888;\n'
		ddata += 'border-bottom	: 1px outset #555555;\n'
		ddata += 'border-left	  : 1px outset #ffffff;"\n'
		ddata += '>\n'

		// Month
		ddata += '<tr id="trmonth" bgcolor="#6699ff" bordercolor="#6699ff" width="140" height="14">\n'
		ddata += '	<th colspan="7" width="140" height="14" align="right"><nobr>\n'
		ddata += '		<font size="4" face="Arial">\n'
		ddata += 			nowtitleyyyymm
		ddata += '		</font>\n'
		ddata += '		<input type=button value="&lt;&lt;" \n'
		ddata += '			onClick="wrtCalendarLay(document.getElementById(\''+oj.name+'\'),null,\''+dateType+'\',-1)">\n'
		ddata += '		<input type=button value="o" \n'
		ddata += '			onClick="wrtCalendarLay(document.getElementById(\''+oj.name+'\'),null,\''+dateType+'\',0)">\n'
		ddata += '		<input type=button value="&gt;&gt;" \n'
		ddata += '			onClick="wrtCalendarLay(document.getElementById(\''+oj.name+'\'),null,\''+dateType+'\',1)">\n'
		ddata += '		</nobr></th>\n'
		ddata += '   </tr>\n'

		// 曜日：日[赤],月〜金[黒],土[青] (2004/7/9 角田桂一 修正)

		// Week
		ddata += '   <TR BGCOLOR=#00cccc WIDTH=140 HEIGHT=14>\n'
		// Week(Sunday:Red)
		ddata += '   <TH WIDTH=14 HEIGHT=14>\n'
		ddata += '   <FONT SIZE="2" COLOR=#ff0000>\n'
		ddata +=	   week[0]
		ddata += '   </FONT>\n'
		ddata += '   </TH>\n'

		// Week(Monday - Friday)
		for (i=1;i<6;i++){
			ddata += '   <TH WIDTH=14 HEIGHT=14>\n'
			ddata += '   <FONT SIZE="2">\n'
			ddata +=	   week[i]
			ddata += '   </FONT>\n'
			ddata += '   </TH>\n'
		}
		// Week(Saturday:Blue)
		ddata += '   <TH WIDTH=14 HEIGHT=14>\n'
		ddata += '   <FONT SIZE="2" COLOR=#0000ff>\n'
		ddata +=	   week[6]
		ddata += '   </FONT>\n'
		ddata += '   </TH>\n'

		ddata += '   </TR>\n'

	// Date
	for(j=0;j<6;j++){
		ddata += '   <TR BGCOLOR=#eeeeee>\n'
		for(i=0;i<7;i++){
			nextday	 = startday.getTime() + (i * 1000*60*60*24)
			wrtday	  = new Date(nextday)
			wrtdate	 = wrtday.getDate()
			wrtmonth	= wrtday.getMonth()
			wrtyear	 = wrtday.getYear()
			if(wrtyear < 1900) wrtyear = 1900 + wrtyear
			wrtyyyymm   = wrtyear * 100 + wrtmonth
			wrtyyyymmdd = ''+wrtyear +'/'+ (wrtmonth+1) +'/'+wrtdate
			getday	  = getWeek(wrtyyyymmdd)
			var outputdate=eval( getDateType(dateType))

			wrtdateA  = '<a onClick="'
			wrtdateA += 'document.getElementById(\''+ oj.name + '\').value=(\''+ outputdate + '\');'
			if(!(Mac&&document.layers)){
				wrtdateA += 'calendarLay[\'calendar\'].moveLAYOJ(getStyleOj(\'calendar\'),' + gox + ',' + goy + ');'
			}
			wrtdateA += 'stop_event__wrtCalendarLay();'
			wrtdateA += '" href="javascript:void(0);"	>\n'

			// 祝日名の取得(2004/7/9 角田桂一 追加)
			getholiday  = ktHolidayName(wrtyyyymmdd)

			// 日付：日[赤],月〜金[黒],土[青]
			//	   前月/翌月[グレー反転]   (2004/7/9 角田桂一 修正)
			if(wrtyyyymm != nowyyyymm){
				wrtdateA += '<FONT COLOR=#eeeeee>\n'
			} else {
			switch(i){
				case 0:
				  wrtdateA += '<FONT COLOR=#ff0000>\n'
				  break
				case 6:
				  wrtdateA += '<FONT COLOR=#0000ff>\n'
				  break
				default: wrtdateA += '<FONT COLOR=#000000>\n'
		  }
		}
		wrtdateA += wrtdate
		wrtdateA += '</FONT>\n'
		wrtdateA += '</A>\n'

		// [日]セルに ALIGN="right" 追加(2004/7/9 角田桂一 修正)
		if(wrtyyyymm != nowyyyymm){
			ddata += ' <TD BGCOLOR=#cccccc WIDTH=14 HEIGHT=14 ALIGN="right">\n'
			ddata += wrtdateA
		} else {
			// 祝日表示(ピンク)を追加(2004/7/9 角田桂一 修正)
			if(getholiday == ''){
				ddata += ' <TD WIDTH=14 HEIGHT=14 ALIGN="right">\n'
			} else {
				ddata += ' <TD BGCOLOR=#ff99ff WIDTH=14 HEIGHT=14 ALIGN="right">\n'
			}
			if(wrtdate == absnow.getDate()
				&& wrtmonth == absnow.getMonth()
			 	&& wrtday.getYear() == absnow.getYear()){
				// 本日強調をピンク背景から太字に変更(2004/7/9 角田桂一 修正)
				ddata += '<B>'+wrtdateA+'</B>\n'
			} else {
				ddata += wrtdateA
			}
		}
		ddata += '   </TD>\n'
	}
	ddata += '   </TR>\n'

	  startday = new Date(nextday)
	  startday = startday.getTime() + (1000*60*60*24)
	  startday = new Date(startday)
	}
	// ステータス行 日付タイプ
	ddata += '   <TR>\n'
	  ddata += '   <TD COLSPAN=7 ALIGN=center STYLE="font-size:11px">\n'
	   ddata += wrtCalendarLay.dateType
	   ddata += ' <INPUT TYPE=button VALUE="close" \n'
	   ddata += 'onClick="moveLAYOJ(getStyleOj(\'calendar\'),'+gox+','+goy+')">\n'
	  ddata += '   </TD>\n'
	ddata += '   </TR>\n'

	ddata += '</TABLE>\n'
	ddata += '</FORM>\n'
	ddata += '</BODY>\n'
	ddata += '</HTML>\n'

	calendarLay['calendar'].outputLAYOJ(getLayOj('calendar'),'')//一時クリア
	calendarLay['calendar'].outputLAYOJ(getLayOj('calendar'),ddata)

	var w = 160;
	var h = 156;
	var x = 100;
	var y = 20;
	//-表示位置調整
	if(document.all){
		//e4,e5,e6
		x = window.event.screenX + 15;
		if(x + w > screen.width){ x = window.event.screenX - 180; }
		y = window.event.screenY - 180;
		if(y < 0){y = window.event.screenY}

	} else if (document.layers || document.getElementById){
		//n4,n6,n7,m1,o6
		x = e.screenX + 10;
		if(x + w > screen.width){ x = e.screenX - 200; }
		y = e.screenY - 200;
		if(y < 0){y = e.screenY; }

	}



	if(e!=null){
	  if(navigator.userAgent.indexOf('Gecko')!=-1){   //n6,m1用
		var left = e.currentTarget.offsetLeft + 100
		left = x + 10
		var top  = e.currentTarget.offsetTop  - 30
		top = y + 80
	  } else {
		var left = getMouseX(e) + 20
		var top  = getMouseY(e) - 30
	  }
	  if(document.layers){ var left = n4_left ; var top  = n4_top }//n4修正
	  calendarLay['calendar'].moveLAYOJ(getStyleOj('calendar'),left,top)
	}
  }

  // 曜日取得
  function getWeek(date){
	if(arguments.length>0)date=date
	else date=null
	if(  Mac && msie )//MacIE5用
	  week   = new Array('sun','mon','tue','wed','thu','fri','sat');
	var now  = new Date(date) ;
	return week[now.getDay()] ;
  }
  // 出力日付のデータタイプ
  function getDateType(dateType){
	  if(nonja || ( Mac && msie )){ //漢字式表記の回避
		if ( dateType == 'yyyy年mm月dd日(曜)')  dateType = 'yyyy/mm/dd(曜)'
		else if( dateType == 'mm月dd日')		dateType = 'mm/dd'
		else if( dateType == 'mm月dd日(曜)')	dateType = 'mm/dd(曜)'
	  }
	  switch(dateType){
		case 'yyyy'
: dtate= "''+wrtyear													" ; break ;
		case 'yyyy/mm'
: dtate= "''+wrtyear +'/'+ (wrtmonth+1)								 " ; break ;
		case 'yyyy/mm/dd'
: dtate= "''+wrtyear +'/'+ (wrtmonth+1) +'/'+wrtdate					" ; break ;
		case 'mm/dd'
: dtate= "''+			  (wrtmonth+1) +'/'+wrtdate					" ; break ;
		case 'mm'
: dtate= "''+			  (wrtmonth+1)								 " ; break ;
		case 'dd'
: dtate= "''+								wrtdate					" ; break ;
		case 'yyyy/mm/dd[曜]'
: dtate= "''+wrtyear +'/'+ (wrtmonth+1) +'/'+wrtdate +' ['+getday +']'  " ; break ;
		case 'yyyy/mm/dd(曜)'
: dtate= "''+wrtyear +'/'+ (wrtmonth+1) +'/'+wrtdate +' ('+getday +')'  " ; break ;
		case 'mm/dd(曜)'
: dtate= "''+			  (wrtmonth+1) +'/'+wrtdate +' ('+getday +')'  " ; break ;
		case 'yyyy年mm月dd日(曜)'
: dtate= "''+wrtyear +'年'+ (wrtmonth+1)+'月'+wrtdate +'日('+getday +')'" ; break ;
		case 'mm月dd日'
: dtate= "''+			  (wrtmonth+1) +'月'+wrtdate +'日'			 " ; break ;
		case 'mm月dd日(曜)'
: dtate= "''+			  (wrtmonth+1) +'月'+wrtdate +'日('+getday +')'" ; break ;
		default
: dtate= "''+wrtyear +'/'+ (wrtmonth+1) +'/'+wrtdate					" ;
	  }
	return dtate
  }

  //--レイヤー生成
  function calendarLay(layName,x,y,dateType){
	this.id	  = layName   // ドラッグできるようにするレイヤー名
	this.x	   = x		 // 初期left位置
	this.y	   = y		 // 初期top位置
	this.dateType = dateType // YYYY/MM/DD
	this.day	 = new Array()
	if(document.layers)	  //n4用
	  this.div='<layer name="'+layName+'" left="'+x+'" top="'+y+'"\n'
			  +'	   onfocus="clickElement=\''+layName
									+'\';mdown_wrtCalendarLay(event);return false">\n'
			  +'<a	 href="javascript:void(0)"\n'
			  +'	   onmousedown="clickElement=\''+layName
									+'\';mdown_wrtCalendarLay(event);return false">\n'
			  + '</a></layer>\n'
	else					 //n4以外用
	  this.div='<div  id="'+layName+'" class="dragLays"\n'
			  +'	  onmousedown="clickElement=\''+layName
									+'\';mdown_wrtCalendarLay(event);return false"\n'
			  +'	  style="position:absolute;left:'+x+'px;top:'+y+'px">\n'
			  + '</div>\n'
	document.write(this.div)
	return
  }
  calendarLay.prototype.moveLAYOJ   = moveLAYOJ   //メソッドを追加する
  calendarLay.prototype.outputLAYOJ = outputLAYOJ //メソッドを追加する
  calendarLay.prototype.zindexLAYOJ = zindexLAYOJ //メソッドを追加する

  //--レイヤー移動
  function moveLAYOJ(oj,x,y){
	if( x == gox && y == goy ){
		getShim().style.display = 'none';
	} else {
		getShim().style.display = 'block';
	}

	getShim().width=140;
	getShim().height=174;
	if(document.getElementById){  //e5,e6,n6,m1,o6用
	  oj.left = x
	  oj.top  = y
	  getShim().style.left=x;
	  getShim().style.top=y;
	} else if(document.all){	  //e4用
	  oj.pixelLeft = x
	  oj.pixelTop  = y
	} else if(document.layers)	//n4用
	  oj.moveTo(x,y)
  }
  //--HTML出力
  function outputLAYOJ(oj,html){
	if(document.getElementById) oj.innerHTML=html  //n6,m1,e5,e6用
	else if(document.all) oj.innerHTML=html //e4用
	else if(document.layers)					   //n4用
	   with(oj.document){
		 open()
		 write(html)
		 close()
	  }
  }
  //--奥行きZ座標set
  function zindexLAYOJ(oj,zindex){
	if(document.getElementById) oj.zIndex=zindex  //n6,m1,e5,e6,o6用
	else if(document.all)	   oj.zIndex=zindex  //e4用
	else if(document.layers)	oj.zIndex=zindex  //n4用
  }

  //--layNameで指定したオブジェクトを返す(必ずonload後に実行すること)
  function getLayOj(layName){
	if(document.getElementById)
	  return document.getElementById(layName)		   //e5,e6,n6,m1,o6用
	else if(document.all)   return document.all(layName)	//e4用
	else if(document.layers)return document.layers[layName] //n4用
  }
  function getStyleOj(clickElement){
	   return (!!document.layers)?getLayOj(clickElement)
								 :getLayOj(clickElement).style
  }

  //--マウスX座標get
  function getMouseX(e){
	if(window.opera)							//o6用
		return e.clientX
	else if(document.all)					   //e4,e5,e6用
		return document.body.scrollLeft+event.clientX
	else if(document.layers||document.getElementById)
		return e.pageX						  //n4,n6,m1用
  }

  //--マウスY座標get
  function getMouseY(e){
	if(window.opera)							//o6用
		return e.clientY
	else if(document.all)					   //e4,e5,e6用
		return document.body.scrollTop+event.clientY
	else if(document.layers||document.getElementById)
		return e.pageY						  //n4,n6,m1用
  }

  //--レイヤ−左辺X座標get
  function getLEFT(layName){
	if(document.all)							//e4,e5,e6,o6用
	  return document.all(layName).style.pixelLeft
	else if(document.getElementById)			//n6,m1用
	  return (document.getElementById(layName).style.left!="")
			  ?parseInt(document.getElementById(layName).style.left):""
	else if(document.layers)					//n4用
	  return document.layers[layName].left
  }

  //--レイヤ−上辺Y座標get
  function getTOP(layName){
	if(document.all)						  //e4,e5,e6,o6用
	  return document.all(layName).style.pixelTop
	else if(document.getElementById)		  //n6,m1用
	  return (document.getElementById(layName).style.top!="")
			  ?parseInt(document.getElementById(layName).style.top):""
	else if(document.layers)				  //n4用
	  return document.layers[layName].top
  }

  //--マウスカーソルを動かした時レイヤーもmoveLAYOJで動かす
  function mmove_wrtCalendarLay(e) {
	if(!window.clickElement) return
	if (getLayOj(clickElement)) {
	   movetoX = getMouseX(e) - offsetX
	   movetoY = getMouseY(e) - offsetY
	   var oj=getStyleOj(clickElement)
	  calendarLay[clickElement].moveLAYOJ(oj,movetoX,movetoY)
	  return false
	}
  }

  //--マウスボタンを押し下げた時
  //  レイヤー内のカーソルoffset位置取得
  function mdown_wrtCalendarLay(e) {
	if(navigator.userAgent.indexOf('Gecko')!=-1)   //n6,m1用
	  if(e.currentTarget.className != 'dragLays') return
	  else clickElement = e.currentTarget.id
	var selLay = getLayOj(clickElement)
	if (selLay){
		offsetX = getMouseX(e) - getLEFT(selLay.id)
		offsetY = getMouseY(e) - getTOP(selLay.id)
	   if(document.layers){
		offsetX = getMouseX(e)+10 ; offsetY = getMouseY(e)+10
	   }
	}
	return false
  }

  //--マウスボタンを上げた時ドラッグ解除
  var zcount = 0
  function mup_wrtCalendarLay(e) {
	if(!window.clickElement) return
	if (getLayOj(clickElement)) {
	  calendarLay[clickElement].zindexLAYOJ(
		getStyleOj(clickElement),zcount++)
	  clickElement=null
	}
  }

  //--イベントキャプチャー開始
  function set_event__wrtCalendarLay(){
	document.onmousemove = mmove_wrtCalendarLay   //n4,m1,n6,e4,e5,e6,o6用
	document.onmouseup   = mup_wrtCalendarLay	 //n4,m1,n6,e4,e5,e6,o6用
	if(navigator.userAgent.indexOf('Gecko')!=-1)  //m1,n6用
	  document.onmousedown = mdown_wrtCalendarLay
	if(document.layers){						  //n4用
	  document.captureEvents(Event.MOUSEMOVE)
	  document.captureEvents(Event.MOUSEUP)
	}
  }

  //--イベントキャプチャー停止
  function stop_event__wrtCalendarLay(){
	document.onmousemove = null				   //n4,m1,n6,e4,e5,e6,o6用
	document.onmouseup   = null				   //n4,m1,n6,e4,e5,e6,o6用
	if(navigator.userAgent.indexOf('Gecko')!=-1)  //m1,n6用
	  document.onmousedown = null
	if(document.layers){						  //n4用
	  document.releaseEvents(Event.MOUSEMOVE)
	  document.releaseEvents(Event.MOUSEUP)
	}
  }

  //--ブラウザの言語を取得
  function getBrowserLANG(){
	if(document.all)
	  return navigator.browserLanguage	  //e4,e5,e6,o6用
	else if(document.layers)
	  return navigator.language			 //n4用
	else if(document.getElementById)
	  return navigator.language.substr(0,2) //n6,n7,m1用
  }

  /*--/////////////ここまで///////////////////////////////////////--*/
