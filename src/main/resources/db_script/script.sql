-- Table: inventory.desktop

-- DROP TABLE inventory.desktop;

-- Use https://www.sqlines.com/online for DB Migration
CREATE TABLE IF NOT EXISTS inventory.desktop
(
    desktop_id bigint NOT NULL DEFAULT nextval('inventory.desktop_seq'::regclass),
    user_name character varying COLLATE pg_catalog."default" NOT NULL,
    sfid character varying COLLATE pg_catalog."default" NOT NULL,
    desktop_sno bigint NOT NULL,
    model character varying COLLATE pg_catalog."default" NOT NULL,
    designation character varying COLLATE pg_catalog."default" NOT NULL,
    mobile character varying COLLATE pg_catalog."default" NOT NULL,
    office_mobile character varying COLLATE pg_catalog."default" NOT NULL,
    division character varying COLLATE pg_catalog."default" NOT NULL,
    purchased_on date NOT NULL,
    warranty_upto date NOT NULL,
    item_code character varying COLLATE pg_catalog."default" NOT NULL,
    price character varying COLLATE pg_catalog."default" NOT NULL,
    remark character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT desktop_pkey PRIMARY KEY (desktop_id)
)

TABLESPACE pg_default;

ALTER TABLE inventory.desktop
    OWNER to postgres;


    -- Table: inventory.laptop

    -- DROP TABLE inventory.laptop;

    CREATE TABLE IF NOT EXISTS inventory.laptop
    (
        laptop_id bigint NOT NULL DEFAULT nextval('inventory.laptop_seq'::regclass),
        user_name character varying COLLATE pg_catalog."default" NOT NULL,
        sfid character varying COLLATE pg_catalog."default" NOT NULL,
        laptop_sno bigint NOT NULL,
        model character varying COLLATE pg_catalog."default" NOT NULL,
        designation character varying COLLATE pg_catalog."default" NOT NULL,
        mobile character varying COLLATE pg_catalog."default" NOT NULL,
        office_mobile character varying COLLATE pg_catalog."default" NOT NULL,
        division character varying COLLATE pg_catalog."default" NOT NULL,
        purchased_on date NOT NULL,
        warranty_upto date NOT NULL,
        item_code character varying COLLATE pg_catalog."default" NOT NULL,
        price character varying COLLATE pg_catalog."default" NOT NULL,
        remark character varying COLLATE pg_catalog."default" NOT NULL,
        CONSTRAINT laptop_pkey PRIMARY KEY (laptop_id)
    )

    TABLESPACE pg_default;

    ALTER TABLE inventory.laptop
        OWNER to postgres;

        -- Table: inventory.printer

        -- DROP TABLE inventory.printer;

        CREATE TABLE IF NOT EXISTS inventory.printer
        (
            printer_id bigint NOT NULL DEFAULT nextval('inventory.printer_seq'::regclass),
            user_name character varying COLLATE pg_catalog."default" NOT NULL,
            sfid character varying COLLATE pg_catalog."default" NOT NULL,
            printer_sno bigint NOT NULL,
            model character varying COLLATE pg_catalog."default" NOT NULL,
            designation character varying COLLATE pg_catalog."default" NOT NULL,
            mobile character varying COLLATE pg_catalog."default" NOT NULL,
            office_mobile character varying COLLATE pg_catalog."default" NOT NULL,
            division character varying COLLATE pg_catalog."default" NOT NULL,
            purchased_on date NOT NULL,
            warranty_upto date NOT NULL,
            item_code character varying COLLATE pg_catalog."default" NOT NULL,
            price character varying COLLATE pg_catalog."default" NOT NULL,
            remark character varying COLLATE pg_catalog."default" NOT NULL,
            CONSTRAINT printer_pkey PRIMARY KEY (printer_id)
        )

        TABLESPACE pg_default;

        ALTER TABLE inventory.printer
            OWNER to postgres;

            -- SEQUENCE: inventory.desktop_seq

            -- DROP SEQUENCE inventory.desktop_seq;

            CREATE SEQUENCE inventory.desktop_seq
                INCREMENT 1
                START 1
                MINVALUE 0
                MAXVALUE 9223372036854775807
                CACHE 1;

            ALTER SEQUENCE inventory.desktop_seq
                OWNER TO postgres;

                -- SEQUENCE: inventory.laptop_seq

                -- DROP SEQUENCE inventory.laptop_seq;

                CREATE SEQUENCE inventory.laptop_seq
                    INCREMENT 1
                    START 1
                    MINVALUE 0
                    MAXVALUE 9223372036854775807
                    CACHE 1;

                ALTER SEQUENCE inventory.laptop_seq
                    OWNER TO postgres;

                    -- SEQUENCE: inventory.printer_seq

                    -- DROP SEQUENCE inventory.printer_seq;

                    CREATE SEQUENCE inventory.printer_seq
                        INCREMENT 1
                        START 1
                        MINVALUE 0
                        MAXVALUE 9223372036854775807
                        CACHE 1;

                    ALTER SEQUENCE inventory.printer_seq
                        OWNER TO postgres;