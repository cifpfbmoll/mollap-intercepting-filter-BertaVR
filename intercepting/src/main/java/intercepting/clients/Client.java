package intercepting.clients;

import intercepting.administrator.TasksProgrammer;

public interface Client {

    void setTasksProgrammer(TasksProgrammer programmer);

    void sendRequest(String request);
}
