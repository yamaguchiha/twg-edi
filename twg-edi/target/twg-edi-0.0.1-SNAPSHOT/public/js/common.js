
/**
 * DocumentがReady状態になったタイミングで実行する共通処理
 */
$(function(){
  alternateRowColor("list");
  searchConditionTableSetup();
  searchCsvTableSetup();
  searchJobTableSetup();
  searchFreeAreaTableSetup();
});

$(window).unload(function(){
  /*firefoxでhistory.back時にonload等が実行されないのを回避する為。(bfcache無効化)*/
});


function checkAll(formObj, prefix, onoff){
	for( i = 0; i < formObj.elements.length; i++ ){
		if( formObj.elements[i].type == 'checkbox' ){
			if( formObj.elements[i].name.substring(0, prefix.length) == prefix){
				formObj.elements[i].checked = onoff;
			}
		}
	}
}

/**
 * 明細行チェックボックス全選択・解除のイベント
 */
function checkAllCkeckbox(formObj, prefix) {
	checkAll(formObj, prefix, formObj.checkAll.checked);
}

function changeContents(url) {
	document.location.href = url;
}


/**
 * commandを指定してsubmitします。
 */
SubmitCheck=false;
function execSubmit(command) {

  if (SubmitCheck) {
    return false;
  }
  $("#command").val(command);
  SubmitCheck = true;
  $("#form1").submit();
}

/**
 * commandとoptionを指定してsubmitします。
 * option(連想配列)は、keyにform項目のid、valueに値をセットします。
 */
function execSubmitWithOption(command, option) {

  if (arguments.length != 2) {
    return false;
  }

  $.each(option, function(prop, value) {
    $("#" + prop).val(value);
  });

  execSubmit(command);
}

 /**
  * 確認メッセージを表示しcommandを指定してsubmitします。
  */
function execSubmitConfirm(command, message) {
  if(!confirm(message)) {
    return false;
  }
  execSubmit(command);
}

/**
* 確認メッセージを表示しcommandとoptionを指定してsubmitします。
* option(連想配列)は、keyにform項目のid、valueに値をセットします。
*/
function execSubmitConfirmWithOption(command, message, option) {
  if(!confirm(message)) {
    return false;
  }
  execSubmitWithOption(command, option);
}

/**
* 確認メッセージを2回表示しcommandとoptionを指定してsubmitします。
* option(連想配列)は、keyにform項目のid、valueに値をセットします。
*/
function execSubmitReConfirmWithOption(command, message, reConfirmMessage, option) {
  if(!confirm(message)) {
    return false;
  }
  execSubmitConfirmWithOption(command, reConfirmMessage, option);
}

function setTextContent(node, value) {
  if (typeof node.textContent != "undefined") {
    // DOM3(Firefox)
    node.textContent = value;
  } else {
    // IE
    node.innerText = value;
  }
  return false;
}


/**
 * テーブルの行に対して交互に色を設定します。
 * class="tableClassName"が指定された<table>が対象。
 * <table>直下の<tbody>が一つの場合は<tr>毎に、
 * <table>直下の<tbody>が複数の場合は<tbody>毎に、
 * 偶数行にeven、奇数行にoddのclassを設定します。
 */
function alternateRowColor(tableClassName) {

  $("table." + tableClassName).each(function(){
    if ($(this).find(">tbody").length == 1) {
      $(this).find(">tbody").find("tr:not(.dummy)" + "tr:even").addClass("even"); // zero origin
      $(this).find(">tbody").find("tr:not(.dummy)" + "tr:odd").addClass("odd");
    } else if ($(this).find(">tbody").length > 1) {
      $(this).find(">tbody:even").addClass("even");
      $(this).find(">tbody:odd").addClass("odd");
    }
  });

}

/**
 * テーブル日付部をスクロールバーで表示します。
 * <div id="scrollContainer">で囲まれた
 * <table>が対象。
 * <table>にid="scrolltbl"を指定してください。
 * rowsで固定するheaderの行数
 * colsで固定する列数を設定します。
 */
function scrollTable(rows, cols) {

	if(document.getElementById("scrolltbl")) {
		var container = document.getElementById("scrollContainer");
	    var tblid = document.getElementById("scrolltbl");
		var height = tblid.offsetHeight;
		if(height < 400) {
			container.style.height = height + 20 + "px";
		}
		new superTable("scrolltbl", {
			cssSkin : "sDefault",
			headerRows : rows,
			fixedCols : cols
		});
	}

}

/**
 * 検索条件テーブル表示/非表示設定
 */
function searchConditionTableSetup() {

  var SRH_COND_TABLE_COOKIE_KEY = "srhCondTableInvisiblePath";
  var pathname = window.location.pathname;

  if (pathname.indexOf("top.do") != -1) {
    $.cookie(SRH_COND_TABLE_COOKIE_KEY, null);
  }

  if ($("#srhCondTable").size() == 0 || $("#srhCondToggleBtn").size() == 0) {
    return;
  }

  if ($.cookie(SRH_COND_TABLE_COOKIE_KEY) != null) {
    if ($.cookie(SRH_COND_TABLE_COOKIE_KEY) == pathname) {
	  $("#srhCondTable").css("display", "none");
	} else {
      var display = $.browser.msie ? "block" : "table";
      $("#srhCondTable").css("display", display);
	}
  }

  var setButtonValue = function() {
    if ($("#srhCondTable").css("display") == "none") {
      $("#srhCondToggleBtn").val("表示");
      $.cookie(SRH_COND_TABLE_COOKIE_KEY, pathname);
    } else {
      $("#srhCondToggleBtn").val("非表示");
      $.cookie(SRH_COND_TABLE_COOKIE_KEY, null);
    }
  };
  setButtonValue();

  $("#srhCondToggleBtn").click(function(){
    $("#srhCondTable").toggle();
    setButtonValue();
  });

}

/**
 * CSVテーブル表示/非表示設定
 */
function searchCsvTableSetup() {

  var SRH_CSV_TABLE_COOKIE_KEY = "srhCsvTableInvisiblePath";
  var pathname = window.location.pathname;

  if (pathname.indexOf("top.do") != -1) {
    $.cookie(SRH_CSV_TABLE_COOKIE_KEY, null);
  }

  if ($("#srhCsvTable").size() == 0 || $("#srhCsvToggleBtn").size() == 0) {
    return;
  }

  if ($.cookie(SRH_CSV_TABLE_COOKIE_KEY) != null) {
    if ($.cookie(SRH_CSV_TABLE_COOKIE_KEY) == pathname) {
	  $("#srhCsvTable").css("display", "none");
	} else {
      var display = $.browser.msie ? "block" : "table";
      $("#srhCsvTable").css("display", display);
	}
  }

  var setCsvButtonValue = function() {
    if ($("#srhCsvTable").css("display") == "none") {
      $("#srhCsvToggleBtn").val("表示");
      $.cookie(SRH_CSV_TABLE_COOKIE_KEY, pathname);
    } else {
      $("#srhCsvToggleBtn").val("非表示");
      $.cookie(SRH_CSV_TABLE_COOKIE_KEY, null);
    }
  };
  setCsvButtonValue();

  $("#srhCsvToggleBtn").click(function(){
    $("#srhCsvTable").toggle();
    setCsvButtonValue();
  });
}

/**
 * 企業マスタ配布データテーブルの表示/非表示設定
 */
function searchJobTableSetup() {

  var JOB_TABLE_COOKIE_KEY = "srhJobTableInvisiblePath";
  var pathname = window.location.pathname;

  if (pathname.indexOf("top.do") != -1) {
    $.cookie(JOB_TABLE_COOKIE_KEY, null);
  }

  if ($("#srhJobTable").size() == 0 || $("#srhJobToggleBtn").size() == 0) {
    return;
  }

  if ($.cookie(JOB_TABLE_COOKIE_KEY) != null) {
    if ($.cookie(JOB_TABLE_COOKIE_KEY) == pathname) {
	  $("#srhJobTable").css("display", "none");
	} else {
      var display = $.browser.msie ? "block" : "table";
      $("#srhJobTable").css("display", display);
	}
  }

  var setCsvButtonValue = function() {
    if ($("#srhJobTable").css("display") == "none") {
      $("#srhJobToggleBtn").val("表示");
      $.cookie(JOB_TABLE_COOKIE_KEY, pathname);
    } else {
      $("#srhJobToggleBtn").val("非表示");
      $.cookie(JOB_TABLE_COOKIE_KEY, null);
    }
  };
  setCsvButtonValue();

  $("#srhJobToggleBtn").click(function(){
    $("#srhJobTable").toggle();
    setCsvButtonValue();
  });
}

/**
 * 納入指示フリーエリアテーブルの表示/非表示設定
 */
function searchFreeAreaTableSetup() {

  var FREE_AREA_TABLE_COOKIE_KEY = "searchFreeAreaTableInvisiblePath";
  var pathname = window.location.pathname;

  if (pathname.indexOf("top.do") != -1) {
    $.cookie(FREE_AREA_TABLE_COOKIE_KEY, null);
  }

  if ($("#srhFreeAreaTable").size() == 0 || $("#srhFreeAreaToggleBtn").size() == 0) {
    return;
  }

  if ($.cookie(FREE_AREA_TABLE_COOKIE_KEY) != null) {
    if ($.cookie(FREE_AREA_TABLE_COOKIE_KEY) == pathname) {
	  $("#srhFreeAreaTable").css("display", "none");
	} else {
      var display = $.browser.msie ? "block" : "table";
      $("#srhFreeAreaTable").css("display", display);
	}
  }

  var setButtonValue = function() {
    if ($("#srhFreeAreaTable").css("display") == "none") {
      $("#srhFreeAreaToggleBtn").val("表示");
      $.cookie(FREE_AREA_TABLE_COOKIE_KEY, pathname);
    } else {
      $("#srhFreeAreaToggleBtn").val("非表示");
      $.cookie(FREE_AREA_TABLE_COOKIE_KEY, null);
    }
  };
  setButtonValue();

  $("#srhFreeAreaToggleBtn").click(function(){
    $("#srhFreeAreaTable").toggle();
    setButtonValue();
  });
}

/**
 * 指定のセレクトボックスをAjax問い合わせ結果で更新する。
 * selectbox セレクトボックスを示すjQueryオブジェクト
 * url ajax問合せ先
 * param 問合せパラメータ オブジェクトリテラル
 */
function updateSelectbox(selectbox, url, param) {
  selectbox.empty();

  // 問い合わせ結果は{key1:value1, key2:value2, ....}のJSONとする
  $.ajaxSetup({ cache: false, ifModified: true });
  jQuery.getJSON(
    url,
    param,
    function(json) {
      var optionItems = new Array();
      for (key in json) {
        optionItems.push('<option value="' + key + '">' + json[key] + '</option>');
      }
      selectbox.append(optionItems.join());
    }
  );
}

/**
 * ダイアログ表示の設定
 * targetId ダイアログ表示する対象のID
 * dialogClass ダイアログに割り当てるクラス名
 * title ダイアログのタイトル
 */
function setupDialog(targetId, dialogClass, title) {
  $("#" + targetId).dialog({
    autoOpen : false,
    draggable : true,
    resizable : false,
    width : 700,
    height : 320,
    title : title,
    dialogClass : dialogClass,
    open : function(event) {
      // jquery-ui-dialogのIEでheightが設定されないバグ回避
      $(".ui-dialog-content").css("cssText", $(".ui-dialog-content").css("cssText") + "; height: 320px !important;");
    },
    dragStop: function(event) {
      // jquery-ui-dialogのIEでheightが設定されないバグ回避
      $(this).dialog("close").dialog("open");
    }
  });
}

/**
 * ダイアログ表示の設定
 * targetId ダイアログ表示する対象のID
 * dialogClass ダイアログに割り当てるクラス名
 * title ダイアログのタイトル
 */
function setupDialogWithSize(targetId, dialogClass, title, widthVal, heightVal) {
  $("#" + targetId).dialog({
    autoOpen : false,
    draggable : true,
    resizable : false,
    modal : true,
    overlay :
    	{opacity: 0.5,background: 'black'},
    width : widthVal,
    height : heightVal,
    title : title,
    dialogClass : dialogClass,
    //buttons : {
    //  Close: function() {
    //    $(this).dialog("close");
    //  }
    //},
    open : function(event) {
      // jquery-ui-dialogのIEでheightが設定されないバグ回避
      $(".ui-dialog-content").css("cssText", $(".ui-dialog-content").css("cssText") + "; height: " + heightVal + "px !important;");
      $(".ui-dialog-titlebar-close").hide();	//右上の×ボタンを非表示
      changeBtnClose(true);	//全ダイアログ共通となるので、非活性のままダイアログが閉じるとそのままとなるため、活性に変更
    },
    dragStop: function(event) {
      // jquery-ui-dialogのIEでheightが設定されないバグ回避
      $(this).dialog("close").dialog("open");
    }
  });
}

/**
 * ダイアログ表示の設定
 * targetId ダイアログ表示する対象のID
 * dialogClass ダイアログに割り当てるクラス名
 * title ダイアログのタイトル
 */
function setupDialogExistsCloseWithSize(targetId, dialogClass, title, widthVal, heightVal) {
  $("#" + targetId).dialog({
    autoOpen : false,
    draggable : true,
    resizable : false,
    //modal : true,
    //overlay :
    //	{opacity: 0.5,background: 'black'},
    width : widthVal,
    height : heightVal,
    title : title,
    dialogClass : dialogClass,
    open : function(event) {
        // jquery-ui-dialogのIEでheightが設定されないバグ回避
        $(".ui-dialog-content").css("cssText", $(".ui-dialog-content").css("cssText") + "; height: " + heightVal + "px !important;");
        //$(".ui-dialog-content").css("cssText", $(".ui-dialog-content").css("cssText") + "; height: 200px !important;");
      },
      dragStop: function(event) {
        // jquery-ui-dialogのIEでheightが設定されないバグ回避
        $(this).dialog("close").dialog("open");
      }
  });
}

/**
 * Dialogの閉じるボタン制御
 * @param isDisable true:活性/false:非活性
 */
function changeBtnClose(isDisable) {
    //Cancelボタンの非活性
    var btn = $('.ui-dialog-buttonpane').find('button:contains("Close")');
    if(isDisable) {
      btn.removeAttr('disabled');
      btn.removeClass('ui-state-disabled');
    } else {
      btn.attr('disabled','disabled');
      btn.addClass('ui-state-disabled');
    }
}

/**
 * 商流階層情報ダイアログ表示の設定
 * targetId ダイアログ表示する対象のID
 * dialogClass ダイアログに割り当てるクラス名
 * title ダイアログのタイトル
 */
function setupHrcDialog(targetId, dialogClass, title) {
  $("#" + targetId).dialog({
    autoOpen : false,
    draggable : true,
    resizable : false,
    width : 700,
    height : 160,
    title : title,
    dialogClass : dialogClass,
    open : function(event) {
      // jquery-ui-dialogのIEでheightが設定されないバグ回避
      $(".ui-dialog-content").css("cssText", $(".ui-dialog-content").css("cssText") + "; height: 160px !important;");
    },
    dragStop: function(event) {
      // jquery-ui-dialogのIEでheightが設定されないバグ回避
      $(this).dialog("close").dialog("open");
    }
  });
}

/**
 * 日付妥当性チェック
 * text yyyy/mm/dd形式の文字列
 * return true:日付として正しい
 */
function isDate(text) {
  if (!text.match(/^\d{4}\/\d{1,2}\/\d{1,2}$/)) {
    return false;
  }

  var arrDate = text.split("/");
  if (arrDate.length == 3) {
    var date = new Date(arrDate[0], arrDate[1] - 1, arrDate[2]);
    if (date.getFullYear() == arrDate[0]
        && (date.getMonth() == arrDate[1] - 1)
        && date.getDate() == arrDate[2]) {
      return true;
    }
  }
  return false;
}

/**
 */
  var beforeNaNQuantityArr = []; // 数値に文字入力警告の抑止用
  function isNaNQuantity(inputObj, name) {
  	objName = inputObj.name;
    if (isNaN(inputObj.value)) {
      if(beforeNaNQuantityArr[objName] == inputObj.value) {
        // 入力に変更がない場合はアラートを出さない
      } else {
        beforeNaNQuantityArr[objName] = inputObj.value;
        alert(name + "は半角数字で入力して下さい");
        inputObj.focus();
      }
      return true;
    } else {
      beforeNaNQuantityArr[objName] = "";
      return false
    }
  }

  /**
   * 年月を指定して月末日を求める関数
   * year 年
   * month 月
   */
  function getMonthEndDay(year, month) {
      var dt = new Date(year, month, 0);
      return dt.getDate();
  }

  /**
   * 年月日と加算月からnヶ月後、nヶ月前の日付を求める
   * year 年
   * month 月
   * day 日
   * addMonths 加算月。マイナス指定でnヶ月前も設定可能
   */
  function computeMonth(year, month, day, addMonths) {
      month += addMonths;
      var endDay = getMonthEndDay(year, month);
      if(day > endDay) day = endDay;
      var dt = new Date(year, month - 1, day);
      return dt;
  }