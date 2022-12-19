class SyncDemo
{
   public static void main(String args[])
   {
      Sender send = new Sender();
      ThreadedSend S1 =
         new ThreadedSend( "Hi" , send );
      ThreadedSend S2 =
         new ThreadedSend( "Bye" , send );

      // Start two threads of ThreadedSend type
      S1.start();
      S2.start();

      // wait for threads to end
      try
      {
         S1.join();
         S2.join();
      }
      catch(Exception e)
      {
         System.out.println("Interrupted");
      }
   }
}
class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg );
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println("Thread interrupted.");
		}
		System.out.println(msg + " sent");
		System.out.println();
	}
}

class ThreadedSend extends Thread
{
	private String msg;
	Sender sender;

	// Receives a message object and a string
	// message to be sent
	ThreadedSend(String m, Sender obj)
	{
		msg = m;
		sender = obj;
	}

	public void run()
	{
		// Only one thread can send a message
		// at a time.
		synchronized(sender)
		{
			// synchronizing the send object
			sender.send(msg);
		}
	}
}
