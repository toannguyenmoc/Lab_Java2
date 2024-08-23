/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.text.JTextComponent;

/**
 *
 * @author ToanNM_PC09504
 */
class Chat_Message_Socket {
Socket socket;
    JTextComponent txpMessage;
    PrintWriter out;
    BufferedReader reader;

    public Chat_Message_Socket(Socket socket, JTextComponent txpMessage) throws IOException {
        this.socket = socket;
        this.txpMessage = txpMessage;
        out = new PrintWriter(socket.getOutputStream());
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        recive();
    }

    public void recive() {
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    try {
                        String line = reader.readLine();
                        if (line != null) {
                            txpMessage.setText(txpMessage.getText() + "\n Nhận: " + line);
                        }
                    } catch (IOException ex) {
                    }
                }
            }
        };
        t.start();
    }

    public void send(String msg) {
        String message = txpMessage.getText();
        txpMessage.setText(message + "\nGửi: " + msg);
        out.println(msg);
        out.flush();
    }
}
