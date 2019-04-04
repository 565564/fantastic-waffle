public abstract class Gun extends Weapon {
    public Gun(String name, String type, int health) {
        super(name, type, health);
    }
    int ammo;
    int possibility = 100;
    int random = (int )(Math.random() * 50 + 1);
    public int shoot(){
        for (int i = 0; i > ammo; i++){
            if (random < 50){
                System.out.println("You missed.");
                return 0;
            }
            System.out.print("You shot someone!");
        }
        return health;
    }
}