function findLucky(arr: number[]): number {
    
};

export function Solve(inputJsonElement: string): any {
	const inputValues: string[] = inputJsonElement.split("\n");
	const arr: number[] = JSON.parse(inputValues[0]);
	return findLucky(arr);
}
