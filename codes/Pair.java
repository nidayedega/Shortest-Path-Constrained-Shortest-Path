
/*
 * Class to hold variables as pairs.
 * 
 * Author : Salih Tuc
 * Creation Date : 15.03.2014
 * 
 * (Updated) : 13.05.2016
 * 
 * 
 * */

public class Pair<L, R> {

	private final L left;
	private final R right;

	public Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}

	public L getLeft() {
		return left;
	}

	public R getRight() {
		return right;
	}

	@Override
	public int hashCode() {
		return left.hashCode() ^ right.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pair))
			return false;
		@SuppressWarnings("unchecked")
		Pair<L, R> pairo = (Pair<L, R>) o;
		return this.left.equals(pairo.getLeft()) && this.right.equals(pairo.getRight());
	}

}