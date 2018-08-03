package com.am.es.model;

import lombok.Data;

import java.util.List;

@Data
public class PageClueInfo {
    private long total;

    private List<ClueQueryResponseModel> list;
}
