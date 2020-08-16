import tkinter as tk
import omok.main_ui as win
import omok.make_widgets as mkw
import omok.train_service as service

def main():

    root = tk.Tk()
    s = service.TrainService()
    app = win.AppWindow(root, '600x600+100+100', s)
    mkw.make(app, s)
    app.mainloop()

main()