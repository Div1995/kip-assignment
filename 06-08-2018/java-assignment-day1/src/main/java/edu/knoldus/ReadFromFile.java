package edu.knoldus;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFromFile {
  public static void main(String args[]) {


    File file = new File("/home/knoldus/Desktop/fileinfo.txt");

    try {

      BufferedReader br = new BufferedReader(new FileReader(file));
      String line;
      Map<String, Integer> mapForWords = new HashMap<>();

      while ((line = br.readLine()) != null) {

        String[] words = line.split(" ");

        for(int i=0;i<words.length;i++) {
          if (!mapForWords.containsKey(words[i]))
            mapForWords.put(words[i], 1);
          else {
            int repeat = mapForWords.get(words[i]);
            mapForWords.put(words[i], repeat + 1);
          }
        }
      }
      System.out.println(mapForWords);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

}
