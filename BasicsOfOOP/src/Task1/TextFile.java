package Task1;

interface Document{
    Object create(Object o);
    Object reName(Object o);
    void output(Object o);
    void add(Object o);
    void delete(Object o);
}

class File implements Document{

    private String nameOfFile;
    private String textInFile;
    private TextFile textFileName;

   File(String nameOfFile, String textInFile, TextFile textFileName){
    this.nameOfFile = nameOfFile;
    this.textInFile = textInFile;
   }

    @Override
    public Object create(File file) {
        file = new File(nameOfFile, textInFile, textFileName);
        return "File " + file.nameOfFile + "  was created!";
    }

    @Override
    public Object reName(File file, String renameFile) {
       file.nameOfFile = renameFile;
        return "New file name is " +  file.nameOfFile;
    }

    @Override
    public Object output(File file) {
     return file.textInFile;
    }

    @Override
    public String add(File file, String addText) {
    String textMix = file.textInFile + addText;
    return textMix;
    }

    @Override
    public void delete(File file) {
        return;
    }
}

class Directory implements Document{
Directory(){

}


    @Override
    public void create() {

    }

    @Override
    public void reName() {

    }

    @Override
    public void output() {

    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }
}


public class TextFile implements Document {
    TextFile textFile;
TextFile(){

}
void create(TextFile textFile){
    this.textFile = textFile;
    textFile = new TextFile();
}

    @Override
    public Object create(TextFile textFile){
          textFile = new TextFile();
          return textFile.
    }

    @Override
    public void reName() {

    }

    @Override
    public void output() {

    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }
}
