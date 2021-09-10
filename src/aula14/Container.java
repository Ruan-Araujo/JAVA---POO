package aula14;

public class Container implements ComparavelContainer {

    private int numID;
    private String paisOrigem;
    private boolean materialPerigoso;

    public Container(int numID, String paisOrigem, boolean materialPerigoso) {
        this.numID = numID;
        this.paisOrigem = paisOrigem;
        this.materialPerigoso = materialPerigoso;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isMaterialPerigoso() {
        return materialPerigoso;
    }

    public void setMaterialPerigoso(boolean materialPerigoso) {
        this.materialPerigoso = materialPerigoso;
    }

    @Override
    public int compareTo(Container container) {
        if (this.numID == container.numID){
            return 0;
        }else if (this.numID > container.numID) {
            return 1;
        }else{
            return -1;
        }
    }
}
