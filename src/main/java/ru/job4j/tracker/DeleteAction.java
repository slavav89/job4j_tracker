package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        boolean result = false;
        out.println("===Delete item===");
        int id = input.askInt("Enter id: ");
        try {
            tracker.delete(id);
            out.println("Заявка удалена успешно.");
            result = true;
        } catch (IllegalArgumentException e) {
            out.println("Ошибка удаления заявки.");
            e.printStackTrace();
        }
        return result;
    }
}
