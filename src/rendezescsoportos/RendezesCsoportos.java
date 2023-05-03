package rendezescsoportos;

public class RendezesCsoportos {

    
public static int[] rendez(int[] tomb) {
    int n = tomb.length;
    int[] rendezettTomb = tomb.clone();

    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (rendezettTomb[j] > rendezettTomb[j+1]) {
                // csere
                int temp = rendezettTomb[j];
                rendezettTomb[j] = rendezettTomb[j+1];
                rendezettTomb[j+1] = temp;
            }
        }
    }

    return rendezettTomb;
}
    }
    

