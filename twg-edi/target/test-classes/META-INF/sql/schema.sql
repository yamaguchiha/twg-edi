    -- Table: public.teacher

DROP TABLE IF EXISTS public.teacher;

    -- SEQUENCE: public.teacher_id_seq

DROP SEQUENCE IF EXISTS public.teacher_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.teacher_id_seq
    INCREMENT 1
    START 30
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.teacher_id_seq
    OWNER TO postgres;

CREATE TABLE IF NOT EXISTS public.teacher
(
    id integer NOT NULL DEFAULT nextval('teacher_id_seq'::regclass),
    user_name character varying(60) COLLATE pg_catalog."default" NOT NULL,
    email character varying(254) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT teacher_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.teacher
    OWNER to postgres;
