-- normally you'd run any queries here to create the DB... for the schema where we store Application Properties, we
-- must manually define the schema and table.
CREATE SCHEMA IF NOT EXISTS CLOUD_CONFIG;
CREATE TABLE IF NOT EXISTS CLOUD_CONFIG.PROPERTIES (
    ID SERIAL PRIMARY KEY,
    APPLICATION TEXT NOT NULL,
    PROFILE TEXT,
    LABEL TEXT NOT NULL,
    PROP_KEY TEXT NOT NULL,
    VALUE TEXT NOT NULL
);