package info.hkzlab.dupal.peeper.exceptions;

import java.io.IOException;

public class DuPALBoardException extends IOException {
    private static final long serialVersionUID = 1L;

    public DuPALBoardException(String message) {
        super(message);
    }
}