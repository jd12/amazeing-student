package maze;

/**
 * An {@link UnsolvableMazeException} is thrown when a {@link Maze} does not
 * have a path from the starting room to an exit.
 * @author jcollard
 *
 */
public class UnsolvableMazeException extends RuntimeException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * default constructor.
   */
  public UnsolvableMazeException() {
    super();
  }
  /**
   * Constructs UnsolvableMazeException with specified message.
   * @param message
   *                the message that is shown when exception is thrown
   */
  public UnsolvableMazeException(final String message) {
    super(message);
  }

}
