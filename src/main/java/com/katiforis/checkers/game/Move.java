
package com.katiforis.checkers.game;

import java.io.Serializable;

public class Move implements Serializable {
	private Cell to;
	private Cell from;
	private Piece piece;
	private boolean isObligatoryMove;

	public Move(){}
	public Move(Cell to, Cell from, Piece piece) {
		this.to = to;
		this.from = from;
		this.piece = piece;
		this.isObligatoryMove = false;
	}

	public Move(Cell to, Cell from, Piece piece, boolean isObligatoryMove) {
		this.to = to;
		this.from = from;
		this.piece = piece;
		this.isObligatoryMove = isObligatoryMove;
	}

	public Cell getTo() {
		return to;
	}

	public void setTo(Cell to) {
		this.to = to;
	}

	public Cell getFrom() {
		return from;
	}

	public void setFrom(Cell from) {
		this.from = from;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public boolean isObligatoryMove() {
		return isObligatoryMove;
	}

	public void setObligatoryMove(boolean obligatoryMove) {
		isObligatoryMove = obligatoryMove;
	}
}