package com.varun.tree;

public interface BinaryTree<T> {
	
	T value();

	BinaryTree<T> parent();
	BinaryTree<T> left();
	BinaryTree<T> right();
	
	/**
	 * @return new root.
	 */
	default BinaryTree<T> normalize() {
		return this;
	}
	
	default boolean isRoot() {
		return !hasParent();
	}

	default boolean hasParent() {
		return parent() != null;
	}

	default boolean hasLeft() {
		return left() != null;
	}

	default boolean hasRight() {
		return right() != null;
	}
}
