package bloconotas;

public class model {

    // Atributos
    private String name;
    private String content;
    private int size;

    // Construtor
    public model(String name) {
        this.name = name;
        this.content = "";
        this.size = 0;
    }

    // Métodos

    public String open() {

        return "Nome do arquivo: " + name +
                "\nConteúdo: " + content +
                "\nTamanho: " + size + "bits";
    }

    public void edit(String newContent) {
        this.content += newContent;
        updateSize();
    }

    {
        System.out.println("Nome do arquivo: " + name);
        System.out.println("Conteúdo: " + content);
        System.out.println("Tamanho: " + size + "bits");
    }

    public boolean rename(String newName) {
        newName = newName.trim();

        if (newName.isEmpty())
            return false;

        this.name = newName;
        return true;
    }

    public void clear() {
        content = "";
        size = 0;
        updateSize();
    }

    private void updateSize() {
        size = content.length() * 8; // tamanho em bits
    }

}