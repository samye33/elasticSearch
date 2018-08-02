package com.am.es.model;

import lombok.Data;

import java.util.List;

@Data
public class PageClueInfo {
    private int total;

    private List<ClueQueryResponseModel> list;
}
