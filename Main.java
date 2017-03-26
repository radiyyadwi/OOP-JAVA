public class Main extends BurungCekakak
{
	public static void main (String[] args) {
		Angsa x = new Angsa();
		System.out.println(x.GetFoodType());
		System.out.println(x.GetClassName());
		System.out.println(x.GetDeskripsi());
		x.Interact();
		if (!x.IsEnemy("kodok")) {
		System.out.println("tested");
		}
		x.Deskripsi();
	}
}