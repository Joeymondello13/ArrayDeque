package josephmondello_arraydeque;

public class QueueOverflowException extends RuntimeException
{
  public QueueOverflowException()
  {
    super();
  }

  public QueueOverflowException(String message)
  {
    super(message);
  }
}