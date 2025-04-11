package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import java.util.Comparator;

public class DescBoardNo implements Comparator<BoardDTO> {

    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        return o2.getBoardNo() - o1.getBoardNo();
    }
}
