package com.minsoo.api.service;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsoo.api.model.common.DomainEntity;

public abstract class DomainEntityService<E extends DomainEntity> {

    protected abstract JpaRepository<E, Long> repository();

    public E get(Long id) {
        E user = find(id);
        if (user == null) {
            throw new NullPointerException();
        }
        return user;
    }

    public E find(Long id) {
        return repository().getOne(id);
    }

    @Transactional
    public E create(E user) {
        return repository().save(user);
    }

    @Transactional
    public void remove(Long id) {
        E user = get(id);
        user.remove();
        repository().save(user);
    }
}
