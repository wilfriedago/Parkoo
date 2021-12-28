/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 * Created: 27 déc. 2021
 */

--Create database parkooDB
CREATE DATABASE "parkooDB"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

--Create parkooDB.caissiers
CREATE TABLE public.caissiers
(
    caid integer NOT NULL,
    caname character varying(180) NOT NULL,
    PRIMARY KEY (caid)
);

CREATE TABLE public.clients
(
    clid integer NOT NULL,
    clname character varying(120),
    clemail character varying(140),
    cltelephone character varying(40),
    PRIMARY KEY (clid)
);

CREATE TABLE public.ventes
(
    veid character varying(40) NOT NULL,
    vedatevente date NOT NULL,
    veprix real NOT NULL DEFAULT 0,
    PRIMARY KEY (veid)
);

CREATE SEQUENCE public."numVen"
    INCREMENT 1
    START 1
    OWNED BY ventes.veid;

ALTER SEQUENCE public."numVen"
    OWNER TO postgres;

CREATE TABLE public.voitures
(
    vonumserie character varying(40) NOT NULL,
    vomarque character varying(120),
    vomodele character varying(180),
    vocouleur character varying(80),
    voprixachat real DEFAULT 0,
    voprixvente real DEFAULT 0,
    PRIMARY KEY (vonumserie)
);

GRANT ALL ON DATABASE "parkooDB" TO postgres;

ALTER TABLE IF EXISTS public.clients
    OWNER to postgres;
ALTER TABLE IF EXISTS public.ventes
    OWNER to postgres;
ALTER TABLE IF EXISTS public.voitures
    OWNER to postgres;
ALTER TABLE IF EXISTS public.caissiers
    OWNER to postgres;

