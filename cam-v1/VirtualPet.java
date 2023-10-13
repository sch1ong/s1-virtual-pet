/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setImage("exercising");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void message(String a) {
        face.setMessage(a);
    }

    public void die () {
        face.setImage("dead");
    }

    public void skeleton () {
        face.setImage("skeleton");
    }

    public void flower () {
        face.setImage("pushingdaisies");
    }

    public void angel () {
        face.setImage("angel");
    }

    public void verysick () {
        face.setImage("verysick");
    }

    public void joyful () {
        face.setImage("joyful");
    }

    public void tired () {
        face.setImage("tired");
    }

    public void cry () {
        face.setImage("cry");
    }

} // end Virtual Pet
