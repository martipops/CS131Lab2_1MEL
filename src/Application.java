public class Application {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Gandalf");
        wizard.setKey(1112);
        wizard.lock(1112);
        System.out.println("Is wizard locked? " + wizard.isLocked());
        wizard.unlock(1413);
        System.out.println("Is wizard locked? " + wizard.isLocked());
        wizard.unlock(1112);
        System.out.println("Is wizard locked? " + wizard.isLocked());
        System.out.println("Wizard health: " + wizard.getHealth());
        wizard.takeDamage(12);
        System.out.println("Wizard health: " + wizard.getHealth());
    }
}