import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void print(){
        for(int i = 0; i < rows.size(); i++){
            if(rows.get(i) != null){
                if(rows.get(i).getScope() != null)
                    System.out.println(rows.get(i).getType() + "\t\t\t" + rows.get(i).getValue()
                            + "\t\t\t" + rows.get(i).getScope());
                else
                    System.out.println(rows.get(i).getType() + "\t\t\t" + rows.get(i).getValue());
            }

        }
    }
}
