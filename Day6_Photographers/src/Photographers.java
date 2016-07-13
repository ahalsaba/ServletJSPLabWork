/**
 * Created by ahalsaba on 7/13/2016.
 */
public class Photographers {
    public interface Photographer{
        public void prepareScene();
        public String takePhotograph();
    }

    public static class SecurityCamera implements Photographer{
        public void prepareScene(){
            System.out.println("Zoom in on the culprit");
        }
        public String takePhotograph(){
            return "Cash being stolen by a man  wearing a cap";
        }
    }

    public static class TrafficCamera implements Photographer{
        public void prepareScene(){
            System.out.println("Adjust to see cars crossing red lights");
        }
        public String takePhotograph(){
            return "Car has a texas license plate and has cut a red light!";
        }
    }

    public static class FamilyCamera implements Photographer{
        public void prepareScene(){
            System.out.println("Squeeze in everyone");
        }
        public String takePhotograph(){
            return "Everyone is smiling, but the child is crying!";
        }
    }


    public static void main(String[] args){
        Photographer[] pics = new Photographer[3];
        pics[0] = new SecurityCamera();
        pics[1] = new TrafficCamera();
        pics[2] = new FamilyCamera();

        for (int i=0; i<pics.length; i++){
            pics[i].prepareScene();
            System.out.println(pics[i].takePhotograph());
        }
    }

}
