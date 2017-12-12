package sample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Ram on 08-08-2017.
 */
public class Memorysuggestion {

    Set<String> s = new LinkedHashSet<>();
    String k =" ";
    public    Set<String>   memwords(String key) throws IOException {


        System.out.println(key + "fetcing from mem suggestion ");
        if (key.charAt(0) == 'a' || key.charAt(0) == 'A') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("amem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("amem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    if (bufferrepo[g].charAt(0) == 'A' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'b' || key.charAt(0) == 'B') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("bmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("bmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'B' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'c' || key.charAt(0) == 'C') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("cmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("cmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'C' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'd' || key.charAt(0) == 'D') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("dmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("dmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'D' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'e' || key.charAt(0) == 'E') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("emem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("emem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'E' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'f' || key.charAt(0) == 'F') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("fmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("fmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'F' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'g' || key.charAt(0) == 'G') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("gmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("gmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'G' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'h' || key.charAt(0) == 'H') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("hmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("hmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'H' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'i' || key.charAt(0) == 'I') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("imem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("imem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'I' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'j' || key.charAt(0) == 'J') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("jmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("jmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'J' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'k' || key.charAt(0) == 'K') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("kmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("kmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'K' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'l' || key.charAt(0) == 'L') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("lmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("lmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'L' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'm' || key.charAt(0) == 'M') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("mmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("mmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'M' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'n' || key.charAt(0) == 'N') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("nmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("nmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'N' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'o' || key.charAt(0) == 'O') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("omem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("omem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'O' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'p' || key.charAt(0) == 'P') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("pmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("pmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'P' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'q' || key.charAt(0) == 'Q') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("qmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("qmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'Q' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'r' || key.charAt(0) == 'R') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("rmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("rmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'R' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 's' || key.charAt(0) == 'S') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("smem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("smem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'S' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 't' || key.charAt(0) == 'T') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("tmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("tmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'T' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'u' || key.charAt(0) == 'U') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("umem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("umem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'U' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'v' || key.charAt(0) == 'V') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("vmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("vmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'V' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'w' || key.charAt(0) == 'W') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("wmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("wmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'W' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'x' || key.charAt(0) == 'X') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("xmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("xmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'X' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'y' || key.charAt(0) == 'Y') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("ymem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("ymem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'Y' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        if (key.charAt(0) == 'z' || key.charAt(0) == 'Z') {
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;
            s.clear();
            String buffer = null;
            try {

                fr = new FileReader("zmem.txt");
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader("zmem.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    buffer = buffer + sCurrentLine;


                }
                String[] bufferrepo = buffer.split(" ");
                for (int g = bufferrepo.length - 1; g > -1; g--)

                {
                    //instead of b , a was here ..spend 2 hr on this .
                    //now working fine for letter A and B  .
                    if (bufferrepo[g].charAt(0) == 'Z' && bufferrepo[g].startsWith(key)) {
                        s.add(bufferrepo[g]);
                        // System.out.println(f);
                    }
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }



        }
        return  s;
    }
    public  void setmemory(String setword)  {
        //issue arose as in repository eveyword has first character upper case.
        //will have to do that here too
        setword = String.valueOf(setword.charAt(0)).toUpperCase()+setword.substring(1);
        System.out.println(setword+"seeting from setmemory");
        if (setword.charAt(0) == 'a' || setword.charAt(0) == 'A') {


            BufferedWriter bw = null;

            FileWriter fw = null;

            s.clear();




                try {
                    File input = new File("amem.txt");
                    fw = new FileWriter(input.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);
                    bw.write(" ");
                    bw.write(setword);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {

                    try {

                        if (bw != null)
                            bw.close();

                        if (fw != null)
                            fw.close();

                    } catch (IOException ex) {

                        ex.printStackTrace();

                    }
                }





        }
        if (setword.charAt(0) == 'b' || setword.charAt(0) == 'B') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("bmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'c' || setword.charAt(0) == 'C') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("cmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'd' || setword.charAt(0) == 'D') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("dmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'e' || setword.charAt(0) == 'E') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("emem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'f' || setword.charAt(0) == 'F') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("fmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'g' || setword.charAt(0) == 'G') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("gmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'h' || setword.charAt(0) == 'H') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("hmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'i' || setword.charAt(0) == 'I') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("imem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'j' || setword.charAt(0) == 'J') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("jmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'k' || setword.charAt(0) == 'K') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("kmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'l' || setword.charAt(0) == 'L') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("lmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'm' || setword.charAt(0) == 'M') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("mmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'n' || setword.charAt(0) == 'N') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("nmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }

        if (setword.charAt(0) == 'o' || setword.charAt(0) == 'O') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("omem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'p' || setword.charAt(0) == 'P') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("pmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'q' || setword.charAt(0) == 'Q') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("qmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'r' || setword.charAt(0) == 'R') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("rmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 's' || setword.charAt(0) == 'S') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("smem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 't' || setword.charAt(0) == 'T') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("tmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'u' || setword.charAt(0) == 'U') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("umem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'v' || setword.charAt(0) == 'V') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("vmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'w' || setword.charAt(0) == 'W') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("wmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'x' || setword.charAt(0) == 'X') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("xmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'y' || setword.charAt(0) == 'Y') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("ymem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        if (setword.charAt(0) == 'z' || setword.charAt(0) == 'Z') {


            BufferedWriter bw = null;

            FileWriter fw = null;






            try {
                File input = new File("zmem.txt");
                fw = new FileWriter(input.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(" ");
                bw.write(setword);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }
            }





        }
        }
    }

