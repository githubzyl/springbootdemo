package com.example.demo.utils;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页查询的参数与结果.<br>
 * 
 */
public class Pager<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int curPage = 1; // 当前页

    // private int pageSize = 2; // 每页多少行
    private int pageSize = 30; // 每页多少行

    private int totalRow; // 共多少行

    private int start;// 当前页起始行

    private int end;// 结束行

    private int totalPage; // 共多少页

    private int prePage;

    private int nextPage;

    private void setPrePageNextPage() {
        prePage = curPage - 1;
        nextPage = curPage + 1;
        if (nextPage > totalPage) {
            nextPage = totalPage;
        }
        if (prePage < 1) {
            prePage = 1;
        }
        // curPage = (prePage + nextPage) /2;
    }

    private List<T> result;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public Pager() {
    }

    public Pager(int curPage, int totalRow) {
        setCurPage(curPage);
        setTotalRow(totalRow);
    }

    // public Pager(Page p) {
    // this.setPageSize(p.getPerPageCount());
    // this.setTotalRow(p.getTotalCount());
    // this.setCurPage(p.getPageIndex());
    //
    // }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        if (curPage < 1) {
            curPage = 1;
        } else {
            start = pageSize * (curPage - 1);
        }
        end = start + pageSize > totalRow ? totalRow : start + pageSize;
        this.curPage = curPage;
        setPrePageNextPage();
    }

    public int getStart() {
        // start=curPage*pageSize;
        return start;
    }

    public int getEnd() {

        return end;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        totalPage = (totalRow + pageSize - 1) / pageSize;
        this.totalRow = totalRow;
        if (totalPage < curPage) {
            curPage = totalPage;
            start = pageSize * ((curPage - 1) < 0 ? 0 : (curPage - 1));
            end = totalRow;
        }
        end = start + pageSize > totalRow ? totalRow : start + pageSize;
    }

    public int getTotalPage() {

        return this.totalPage;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
