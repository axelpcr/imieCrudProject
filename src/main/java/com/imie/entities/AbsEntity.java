package com.imie.entities;

import javax.persistence.*;

/**
 * Created by axel on 14/06/16.
 */
@MappedSuperclass
public class AbsEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        protected Long id;
        @Version
        protected Long version;

        public Long getId() {
            return id;
        }

        public Long getVersion() {
            return version;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setVersion(Long version) {
            this.version = version;
        }
}
