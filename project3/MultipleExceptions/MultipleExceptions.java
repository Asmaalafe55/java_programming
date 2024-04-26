package project3.MultipleExceptions;

import java.text.ParseException;
import javax.imageio.IIOException;

public class MultipleExceptions {

  public void start() throws IIOException, ParseException {
    // lets say that we have an error
    throw new IIOException(null, null);

    // lets assume that we have another error
    // we want to throw another exception

    throw new ParseException(null, 0);
    // this is not a list of exceptions that are going to be thown, its one exception at a time
  }
}
