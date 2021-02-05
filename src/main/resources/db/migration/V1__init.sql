create TABLE if not exists dinosaurus (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name VARCHAR(256),
    encrypted_name VARBINARY(512),
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT NULL ON update CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;