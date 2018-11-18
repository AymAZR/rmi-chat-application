# rmi-chat-application

This repository contains a simple RMI chat application created using Eclipse IDE.

- To run the project, You will need to open 4 Terminal Windows, then in each window go to the /bin directory of the project using the "cd" command.

- In the first terminal, execute the following command lines :
  . rmic rmiServer.Server
  . rmic rmiClient.Client
  . rmiregistry

- In the second terminal window, launch the Server Driver using : java rmiServer.ServerDriver

Now you're all set up, you just need to create two clients (users) to communicate with each other. That's the purpose of the last two Terminal Windows.

- For example, open one of those two terminal windows and create the first client using : java rmiClient.ClientDriver "Name of the first client" without the quotation marks.

- Finally, in the last remaining Terminal window, create another client using the same command line as above.

Press "Enter", and start chatting!
