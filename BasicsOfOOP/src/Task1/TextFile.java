package Task1;

interface Document{
    Object create(File file, String nameOfFile, String textInFile);
    Object reName(File file, String reNameFile);
    Object output(File file);
    Object add(File file, String addText);
    String delete(File file);
}

class File implements Document{

    private String nameOfFile;
    private String textInFile;
    private TextFile textFileName;

   File(String nameOfFile, String textInFile){
        this.nameOfFile = nameOfFile;
        this.textInFile = textInFile;
      }


    @Override
    public Object create(File file, String nameOfFile, String textInFile) {
        file = new TextFile(nameOfFile, textInFile);
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
    public Object add(File file, String addText) {
        String textMix = file.textInFile + addText;
        return textMix;
    }

    @Override
    public String delete(File file) {
        file.textInFile = null;
        return file.textInFile;
    }
}

class Directory{

        String nameOfDirectory;

        File [] files;

    Directory(String nameOfDirectory, File [] files){

        this.nameOfDirectory = nameOfDirectory;

        this.files = files;


}



    public Object create(Directory directory) {
        directory = new Directory(nameOfDirectory, files);
        return "Directory " + directory.nameOfDirectory + "  was created!";
    }


    public Object reName(Directory directory, String nameForChanging) {
        directory.nameOfDirectory = nameForChanging;
        return "New directory name is " + directory.nameOfDirectory ;
    }


}


public class TextFile extends File{

    TextFile textFile;
    String nameOfTextFile;
    String textInTextFile;


    TextFile(String nameOfTextFile, String textInTextFile){

            super(nameOfTextFile, textInTextFile);

    }

    public static void main(String[] args) {

        TextFile textFile1 = null;

        TextFile textFile;

       // textFile.create(textFile1, "dfs", "djf fk fk fkm ");

        Directory directory = new Directory("Praca", new File[]
                {/*(File) new TextFile("Lala", "kjfdkgjkfks klsdjjfd kdfjl")
                        .create(textFile1),*/
                new TextFile("Tala", "skhfj dkjfh kdsjd kdkjfk kdjf")
                });
        File file = new TextFile("Lapa", "kjas dkj dlj lkdj dlkj dj djvlj");
      //  file.create(textFile, "dfs", "djf fk fk fkm ");
       // file.output(textFile);
       // file.add(textFile, "jsdfk djf djfjh dffdhjh djjfj11111111");
       // file.output(textFile);
        file.delete(textFile1);
        //file.output(textFile);
      //  file.reName(textFile, "Papap");

        directory.create(new Directory("Gaca", new File[]{
                new TextFile("Tara", "djnfjndld f d"),
                new File("Ratat", "dsjfdf 112 23 4 5 5 6 6 7 7 "),
                        new File("Ppp", "dfs d123f")}));
        directory.reName(directory, "Hobbies");

    }

}
