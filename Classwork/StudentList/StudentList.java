import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    ArrayList<String> studentList = new ArrayList<>(0);

    public void join(String name) {
        
        // FIX LATER
        // if (studentList.isEmpty()) {
        //     studentList.add(name);
        // }

        // for (int i = 0; i < studentList.size(); i++) {
        //     if (studentList.get(i).compareTo(name) == 1) {
        //         studentList.add(i, name);
        //     }
        // }

        studentList.add(name);
        Collections.sort(studentList);
    }

    public String[] getList() {
        String[] arr = new String[studentList.size()];
        for (int i = 0; i < studentList.size(); i++) {
            arr[i] = studentList.get(i);
        }

        return arr;
    }

    public String getStudentByIndex(int index) {
        return studentList.get(index);
    }

    public int findStudent(String name) {
        int lower = 0;
        int upper = studentList.size() - 1;

        while(lower <= upper){
            int middle = (lower + upper)/2;

            if(studentList.get(middle).compareTo(name) == 0){
                return middle;
            }
            else if(studentList.get(middle).compareTo(name) == -1){
                lower = middle + 1;
            }
            else{
                upper = middle - 1;
            }
        }
        return -1;
    }
}
