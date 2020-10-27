package info.hkzlab.dupal.peeper.peephole;

import info.hkzlab.dupal.peeper.exceptions.PeepholeException;

public interface PeepholeInterface {
    public void write(boolean[] pins) throws PeepholeException;
    public boolean[] read() throws PeepholeException;
    public void clock(boolean[] pins) throws PeepholeException;
    public boolean open() throws PeepholeException;
    public void close();
}
