<div align="justify">

# Elbow
## Introduction
In this research he describes what the elbow is and in what situations it is needed, as an advance it is a method that supports us in the model of k means to group.
## Development
K-means is a simple unsupervised machine learning algorithm that groups a data set into a user-specified number (k) of clusters. The algorithm is somewhat naive: it groups the data into k groups, even if k is not the correct number of groups to use. Therefore, when using k-means clustering, users need some way to determine if they are using the correct number of clusters.

One method of validating the number of groups is the elbow method. The idea of the elbow method is to perform the clustering of k-means in the data set for a range of values of k, and for each value of k to calculate the sum of squared errors.
### clusters
Clustering is an unsupervised learning problem whereby we aim to group sub-sets of entities together based on some notion of similarity. Clustering is often used for exploratory analysis and / or as a component of a hierarchical supervised learning pipeline (in which separate classifiers or regression models are trained for each cluster).
MLlib supports k-means clustering, one of the most widely used clustering algorithms that groups data points into a predefined number of clusters. The MLlib implementation includes a parallelized variant of the k-means method called kmeans. The implementation in MLlib has the following parameters:
- K is the desired number of clusters.
- MaxIterations is the maximum number of iterations to run.
- InitializationMode specifies random initialization or initialization via k-means.
- Runs is the number of times the k-means algorithm is run (k-means is not guaranteed to find a globally optimal solution, and when run multiple times on a given dataset, the algorithm returns the best result of clustering).
- InitializationSteps determines the number of steps in the k-means algorithm.
- Epsilon determines the distance threshold within which we consider k-means to have converged.
## Visual example
![img](https://drive.google.com/uc?export=view&id=1utR82L-pJXbb6NTdQOAiqYtYwXlDvQ1F)
## Conclution
As mentioned earlier in the development of this research, the important thing about this method is that it helps us to know in an easy and visual way how many clusters are the ones that k mean needs to be grouped without having to guess.
## References
- Robert Gove’s. (2017). Using the elbow method to determine the optimal number of clusters for k-means clustering. 2020, de Block Sitio web: https://bl.ocks.org/rpgove/0060ff3b656618e9136b
spark. (----). MLlib 
- Clustering. 2020, de spark Sitio web: https://spark.apache.org/docs/1.2.2/mllib-clustering.html
