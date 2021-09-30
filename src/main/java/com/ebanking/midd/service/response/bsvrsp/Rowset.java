package com.ebanking.midd.service.response.bsvrsp;

import java.util.ArrayList;

public class Rowset {
    private int count;
    private ArrayList<Row> rows;

    public Rowset(int count, ArrayList<Row> rows) {
        this.count = count;
        this.rows = rows;
    }

    public Rowset() {
        this(0,new ArrayList<Row>());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }
}
