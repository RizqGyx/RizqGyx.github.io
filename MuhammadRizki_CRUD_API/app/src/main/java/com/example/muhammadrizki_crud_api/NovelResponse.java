package com.example.muhammadrizki_crud_api;

import java.util.List;

public class NovelResponse<T> {
    List<T> result;
    public List<T> getResult() {
        return result;
    }
    public void setResult(List<T> result) {
        this.result = result;
    }
}
