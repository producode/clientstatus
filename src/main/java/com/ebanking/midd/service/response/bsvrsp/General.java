package com.ebanking.midd.service.response.bsvrsp;

public class General {
    private Rowset rowset;

    public General(Rowset rowset) {
        this.rowset = rowset;
    }

    public General() {
        this(new Rowset());
    }

    public Rowset getRowset() {
        return rowset;
    }

    public void setRowset(Rowset rowset) {
        this.rowset = rowset;
    }
}
