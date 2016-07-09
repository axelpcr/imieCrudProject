package com.imie.entities;

import javax.persistence.*;

/**
 * Parent class of all Entities
 *
 * Created by axel on 14/06/16.
 */
@MappedSuperclass
public class AbsEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        protected Integer id;
        @Version
        protected Long version;

        public Integer getId() {
            return id;
        }

        public Long getVersion() {
            return version;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setVersion(Long version) {
            this.version = version;
        }
}
