package ru.zotov.dao.repository;

public interface Repository<DOMAIN, ID> {
    DOMAIN findById(ID id);
    void save (DOMAIN domain);
    void update (DOMAIN domain);
    void delete (DOMAIN domain);
}
