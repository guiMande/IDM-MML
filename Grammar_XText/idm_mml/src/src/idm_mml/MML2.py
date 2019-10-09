import pandas as pd
from sklearn.model_selection import cross_val_score
from sklearn import tree

df = pd.read_csv("date2.csv")

x = df.drop(columns=["col5"])
y = df["col5"]

scores = cross_val_score(x, y, cv=15)

#Difficultés à mettre en place l'algorithme sur la cross validation
#clf = tree.ExtraTreeClassifier()

#clf.fit(X_train, y_train)

print("Accuracy: %0.2f (+/- %0.2f)" % (scores.mean(), scores.std() * 2))