package io;
import model.*;

public interface DataWriter {
    void write(Person person) throws InvalidDataException;
}
