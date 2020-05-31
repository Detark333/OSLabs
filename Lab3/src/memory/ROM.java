package memory;
import static info.SystemInfo.*;
public class ROM {
	private TableRecord[] table;

	public ROM() {
		generatePageTable();
	}

	public void getPage(int index) {
		if (index >= 0 && index < VIRTUAL_PAGES.getValue()) {
			System.out.println("Page " + index + " loaded from disk");
		} else {
			throw new IllegalArgumentException("Index of of range");
		}
	}

	public void updatePage(int index) {
		if (index >= 0 && index < VIRTUAL_PAGES.getValue()) {
			System.out.println("Page " + index + " updated on disk");
		} else {
			throw new IllegalArgumentException("Index of of range");
		}
	}

	public void generatePageTable() {
		table = new TableRecord[VIRTUAL_PAGES.getValue()];
		for (int i = 0; i < table.length; i++) {
			TableRecord record = new TableRecord();
			table[i] = record;
		}
	}

	public TableRecord[] getData() {
		return table;
	}
}
