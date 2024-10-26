# Generate the marks of different subjects of different students randomly and store them in a “.csv” file then read it and plot average marks of each subject using bar plot and pie plot.

import pandas as pd
import matplotlib.pyplot as plt

data=pd.read_csv('pro2.csv')
data_mean=data.mean()

plt.pie(data_mean)

plt.legend(data.head())
plt.title("Average Marks of Each Student")
plt.show()


