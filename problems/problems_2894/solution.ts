function differenceOfSums(n: number, m: number): number {
    
};

export function Solve(inputJsonElement: string): any {
	const inputValues: string[] = inputJsonElement.split("\n");
	const n: number = JSON.parse(inputValues[0]);
	const m: number = JSON.parse(inputValues[1]);
	return differenceOfSums(n, m);
}
