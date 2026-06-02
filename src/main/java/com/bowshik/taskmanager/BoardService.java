package com.bowshik.taskmanager;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository=boardRepository;
    }
    public List<Board> getAllBoards(){
        return boardRepository.findAll();
    }
    public Board createBoard(Board board){
        return boardRepository.save(board);
    }
    public void deleteBoard(Long id){
        boardRepository.deleteById(id);
    }
    public Board updateBoard(Long id, Board updatedBoard) {
        Board existing = boardRepository.findById(id).orElseThrow();
        existing.setTitle(updatedBoard.getTitle());
        return boardRepository.save(existing);
    }
}
