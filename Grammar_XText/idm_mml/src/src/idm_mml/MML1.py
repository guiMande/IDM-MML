import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn import tree
from sklearn.metrics import accuracy_score

df = pd.read_csv("date.csv")

X = df.drop(columns=["col5"])
y = df["col5"]

test_size = 0.35
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=test_size)

clf = tree.DecisionTreeClassifier()

clf.fit(X_train, y_train)

accuracy = accuracy_score(y_test, clf.predict(X_test))

print(accuracy)